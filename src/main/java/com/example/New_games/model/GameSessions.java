package com.example.New_games.model;


import com.example.New_games.model.enums.SessionStatus;
import jakarta.persistence.*;
import jdk.dynalink.linker.LinkerServices;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "game_sessions")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class GameSessions {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date started_at;

    @Temporal(TemporalType.TIMESTAMP)
    private Date ended_at;

    @Enumerated(EnumType.STRING)
    private SessionStatus status;

    private BigDecimal owner_profit;

    @OneToMany(mappedBy = "session", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<GameParticipants> participants;
}
