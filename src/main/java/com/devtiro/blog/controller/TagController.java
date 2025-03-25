package com.devtiro.blog.controller;

import com.devtiro.blog.domain.dtos.CreateTagsRequest;
import com.devtiro.blog.domain.dtos.TagResponse;
import com.devtiro.blog.domain.entities.Tag;
import com.devtiro.blog.mappers.TagMapper;
import com.devtiro.blog.services.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/tags")
@RequiredArgsConstructor
public class TagController {
    private final TagService tagService;
    private final TagMapper tagMapper;

    @GetMapping
    public ResponseEntity<List<TagResponse>> getAllTags() {
        List<Tag> tags = tagService.getTags();
        List<TagResponse> tagResponses = tags.stream().map(tagMapper::toTagResponse).toList();
        return ResponseEntity.ok(tagResponses);
    }

    @PostMapping
    public ResponseEntity<List<TagResponse>> createTags(@RequestBody CreateTagsRequest createTagsRequest) {
       List<Tag> savedTags = tagService.createTags(createTagsRequest.getNames());
       List<TagResponse> createdTagResponses = savedTags.stream().map(tagMapper::toTagResponse).toList();
       return new ResponseEntity<>(
               createdTagResponses,
               HttpStatus.CREATED
       );
    }
}
