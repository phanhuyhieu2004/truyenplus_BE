package com.example.truyen_be.Repository;


import com.example.truyen_be.Model.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IChapterRepository extends JpaRepository<Chapter,Long> {


    @Query(value = "SELECT * FROM chapters WHERE story_id = ? ORDER BY created_at DESC",nativeQuery = true)
    List<Chapter> findByStoryIdOrderByCreatedAtDesc(Long storyId);
    boolean existsByChapterNumberAndStory_StoryId(int chapterNumber, Long storyId);
    boolean existsByTitleAndStory_StoryId(String title, Long storyId);
}
