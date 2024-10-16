package com.human.notice.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class SearchVO {
    private String searchType;
    private String searchKeyword;
    private String category;

    // Getters and setters
}
