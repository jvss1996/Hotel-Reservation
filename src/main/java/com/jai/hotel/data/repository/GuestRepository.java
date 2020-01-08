package com.jai.hotel.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.jai.hotel.data.entity.Guest;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends PagingAndSortingRepository<Guest, Long> {

}