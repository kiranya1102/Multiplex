package com.multiplex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multiplex.entities.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer>{

}
