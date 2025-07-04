package com.example.New_games.model;

import com.example.New_games.model.enums.TransacsionStatus;
import com.example.New_games.model.enums.TransacsionType;
import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.IDENTITY;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
@Entity
@Table(name = "transaction")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Transaction {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id" )
    private User user;

    @Enumerated(EnumType.STRING)
    private TransacsionType type;

    private BigDecimal amout;

    @Enumerated(EnumType.STRING)
    private TransacsionStatus status;

    private String paymentId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updated_at;
}