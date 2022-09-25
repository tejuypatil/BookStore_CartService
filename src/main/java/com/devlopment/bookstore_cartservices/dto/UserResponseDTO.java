package com.devlopment.bookstore_cartservices.dto;
import com.devlopment.bookstore_cartservices.entity.UserData;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserResponseDTO {
    private String message;
    private UserData userData;

    public UserResponseDTO(String message, UserData userData) {
        this.message = message;
        this.userData = userData;
        this.userData.setPassword("********************");
    }

}
