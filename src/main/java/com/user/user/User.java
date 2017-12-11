package com.user.user;

//import com.user.order.model.OrderEntity;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"orders"})
@ToString(exclude = "orders")
@Document(collection = "user")
public class User {

    @Id
    private String id;

    private String name;

    private String lastName;

    private String email;

    private String login;

    private String addresse;

    private String cp;

    private String ville;

    private String type;

    @DBRef
    private List<String> orders = new ArrayList<>(0);
}

