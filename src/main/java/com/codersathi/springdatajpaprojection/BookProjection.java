package com.codersathi.springdatajpaprojection;

import java.util.List;

public interface BookProjection {
    String getTitle();
    String getAuthor();
    List<ChapterProjection> getChapters();

}
