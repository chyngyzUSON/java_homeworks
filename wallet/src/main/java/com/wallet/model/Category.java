package com.wallet.model;


import lombok.*;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@XmlRootElement(name = "category")
public class Category /*extends ParentCategory*/{
    private Long id;
    private String name;
    private User user;
    private String parentCategoryId;
    private boolean isActive;
    private Date createdDate;

}












