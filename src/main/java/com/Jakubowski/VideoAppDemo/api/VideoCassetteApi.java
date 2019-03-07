package com.Jakubowski.VideoAppDemo.api;

import com.Jakubowski.VideoAppDemo.dao.entity.VideoCassette;
import com.Jakubowski.VideoAppDemo.manager.VideoCassettsManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/cassetts")
public class VideoCassetteApi  {

    private VideoCassettsManager videoCassettsManager;

    @Autowired
    public VideoCassetteApi(VideoCassettsManager videoCassettsManager) {
        this.videoCassettsManager = videoCassettsManager;
    }

    @GetMapping("/all")
    public Iterable<VideoCassette> getAll(){
        return videoCassettsManager.findAll();
    }

    @GetMapping()
    public Optional<VideoCassette> getByID(@RequestParam Long index){
        return videoCassettsManager.findById(index);
    }

    @PostMapping
    public VideoCassette addVideo(@RequestBody VideoCassette videoCassette){
        return videoCassettsManager.save(videoCassette);
    }

    @PutMapping
    public VideoCassette updateVide(@RequestBody VideoCassette videoCassette){
        return videoCassettsManager.save(videoCassette);
    }

    @DeleteMapping
    public void deleteVideo(@RequestParam Long index){
         videoCassettsManager.deleteById(index);
    }
}
