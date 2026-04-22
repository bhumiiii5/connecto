package com.connecto.controller;

import com.connecto.entity.Booking;
import com.connecto.entity.User;
import com.connecto.repository.BookingRepository;
import com.connecto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/bookings")
@CrossOrigin(origins = "*")
public class BookingController {
    
    @Autowired
    private BookingRepository bookingRepository;
    
    @Autowired
    private UserRepository userRepository;
    
    @PostMapping
    public ResponseEntity<?> createBooking(@RequestBody Map<String, String> request) {
        Map<String, Object> response = new HashMap<>();
        
        String userEmail = request.get("userEmail");
        String station = request.get("station");
        String timeSlot = request.get("timeSlot");
        
        var userOpt = userRepository.findByEmail(userEmail);
        if (userOpt.isEmpty()) {
            response.put("success", false);
            response.put("message", "User not found");
            return ResponseEntity.badRequest().body(response);
        }
        
        User user = userOpt.get();
        Booking booking = new Booking(user, station, timeSlot);
        bookingRepository.save(booking);
        
        response.put("success", true);
        response.put("message", "Booking created");
        response.put("bookingId", booking.getId());
        
        return ResponseEntity.ok(response);
    }
    
    @GetMapping("/user/{email}")
    public ResponseEntity<?> getUserBookings(@PathVariable String email) {
        var userOpt = userRepository.findByEmail(email);
        if (userOpt.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        
        User user = userOpt.get();
        List<Booking> bookings = bookingRepository.findByUser(user);
        
        return ResponseEntity.ok(bookings);
    }
    
    @GetMapping("/user/{email}/count")
    public ResponseEntity<?> getUserBookingCount(@PathVariable String email) {
        var userOpt = userRepository.findByEmail(email);
        if (userOpt.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        
        User user = userOpt.get();
        long count = bookingRepository.countByUser(user);
        
        Map<String, Long> response = new HashMap<>();
        response.put("totalBookings", count);
        
        return ResponseEntity.ok(response);
    }
}

