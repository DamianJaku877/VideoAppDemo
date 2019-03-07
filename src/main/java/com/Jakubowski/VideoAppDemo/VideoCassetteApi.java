package com.Jakubowski.VideoAppDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cassetts")
public class VideoCassetteApi  {

    private List<VideoCassette> videoCassettes;

    public VideoCassetteApi() {
        videoCassettes = new ArrayList<>();
        videoCassettes.add(new VideoCassette(1L,"Naruto", LocalDate.of(1999,12,02)));
        videoCassettes.add(new VideoCassette(2L,"Games of Throne", LocalDate.of(2018,6,16)));
    }

    @GetMapping("/all")
    public List<VideoCassette> getAll(){
        return videoCassettes;
    }

    @GetMapping()
    public VideoCassette getByID(@RequestParam int index){
        Optional <VideoCassette> first = videoCassettes.stream().filter(element -> element.getId() == index).findFirst();
        return first.get();
    }
}
