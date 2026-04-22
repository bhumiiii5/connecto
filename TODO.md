# Connecto Dashboard Fixes - Implementation Tracking
**Current Working Directory: d:/connecto**

## Approved Plan Breakdown

### ✅ [COMPLETE] 1. Create TODO.md file

### 📋 [IN PROGRESS] 2. Fix Profile Dropdown Hover Issue
- [ ] Update CSS for `.dropdown-menu` and `.dropdown.show`
- [ ] Add `toggleProfileMenu()` JS function
- [ ] Add global click-outside-to-close
- [ ] Attach `onclick="toggleProfileMenu(event)"` to both `.profile` divs (already present)

### ⏳ [PENDING] 3. Reposition Logout in Account Actions
- [ ] Move logout button above Download My Data
- [ ] Remove duplicate from topbar dropdowns

### ⏳ [PENDING] 4. Implement Security Button Functionality
- [ ] Add onclick handlers to security buttons
- [ ] Create `#securityModal` HTML
- [ ] Add `showSecurityModal()`, `updatePassword()`, `closeSecurityModal()` JS

### ⏳ [PENDING] 5. Test All Changes
- [ ] Test sidebar dropdown hover/click
- [ ] Test topbar dropdown hover/click  
- [ ] Verify logout works from Account Actions
- [ ] Test security modals (password change, 2FA, history)
- [ ] Test mobile responsiveness

### ⏳ [PENDING] 6. Final Validation & Complete
- [ ] Remove this TODO.md or mark ✅ COMPLETE
- [ ] Run `attempt_completion`

**Next Step:** Step 2 - Profile dropdown fixes in dashboard.html
