package org.esnack24api.esnack24adminapi.user.dto;

import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Data
public class UserDetailDTO {

    private Long uno;

    private String email;

    private String upw;

    private String username;

    private String gender;

    private String callNumber;

    private Timestamp birth;

    private List<String> allergyList;

    private List<UserOrderDTO> orderList;

}
