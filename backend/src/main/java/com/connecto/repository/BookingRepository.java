package com.connecto.repository;

import com.connecto.entity.Booking;
import com.connecto.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByUserOrderByBookedAtDesc(User user);
    
    @Query("SELECT b FROM Booking b WHERE b.user.email = ?1 ORDER BY b.bookedAt DESC")
    List<Booking> findByUserEmailOrderByBookedAtDesc(String email);
    
    long countByUser(User user);
}

