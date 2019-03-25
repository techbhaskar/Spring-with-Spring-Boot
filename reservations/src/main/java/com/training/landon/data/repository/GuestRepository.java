package com.training.landon.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.training.landon.data.entity.Guest;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends PagingAndSortingRepository<Guest, Long> {

}