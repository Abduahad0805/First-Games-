package com.example.New_games.model;

import com.example.New_games.model.enums.Result;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "game_participants")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class GameParticipants {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "session_id")
    private Long sessionId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Long userId;

    private BigDecimal bet_amount;

    @Enumerated(EnumType.STRING)
    private Result result;

    private BigDecimal payout_amount;

    private Integer weight;
}
