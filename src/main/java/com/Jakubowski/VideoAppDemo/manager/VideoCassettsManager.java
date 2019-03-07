package com.Jakubowski.VideoAppDemo.manager;

import com.Jakubowski.VideoAppDemo.dao.VideoCassetteRepository;
import com.Jakubowski.VideoAppDemo.dao.entity.VideoCassette;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class VideoCassettsManager {

    private VideoCassetteRepository videoCassetteRepository;

    @Autowired
    public VideoCassettsManager(VideoCassetteRepository videoCassetteRepository) {
        this.videoCassetteRepository = videoCassetteRepository;
    }

    public Optional<VideoCassette> findById(Long id){
        return videoCassetteRepository.findById(id);
    }

    public Iterable<VideoCassette> findAll(){
        return videoCassetteRepository.findAll();
    }

    public VideoCassette save(VideoCassette videoCassette){
        return videoCassetteRepository.save(videoCassette);
    }
    public void deleteById(Long id){
         videoCassetteRepository.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB() {
        save(new VideoCassette(1L,"Naruto", LocalDate.of(1999,12,02)));
        save(new VideoCassette(2L,"DragonBall Z", LocalDate.of(1987,1,29)));
    }
}
