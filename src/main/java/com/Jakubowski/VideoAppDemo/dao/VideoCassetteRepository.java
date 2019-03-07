package com.Jakubowski.VideoAppDemo.dao;

import com.Jakubowski.VideoAppDemo.dao.entity.VideoCassette;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoCassetteRepository extends CrudRepository<VideoCassette, Long> {
}
