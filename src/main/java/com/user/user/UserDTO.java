package com.user.user;

//import com.user.order.model.OrderEntity;
import lombok.*;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.GeneratedValue;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"orders"})
@ToString(exclude = "orders")
@Getter
@Setter
public class UserDTO {
    private String id;

    @NotBlank
    @NotNull
    @Size(min = 3, max = 40)
    private String name;

    @NotBlank
    @NotNull
    @Size(min = 3, max = 40)
    private String lastName;

    @NotNull
    @NotBlank
    private String login;

    @NotNull
    @NotBlank
    private String email;


    @NotNull
    @NotBlank
    private String addresse;

    @NotNull
    @NotBlank
    private String ville;

    @NotNull
    @NotBlank
    private String cp;

    @NotNull
    @NotBlank
    private String type;

    private List<String> orders = new ArrayList<>(0);
}