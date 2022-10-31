package com.board.trip.Service;

import com.board.trip.model.Post;

import java.sql.SQLException;

public interface PostService {
    void savePost (Post post) throws SQLException;
}
