package devops.intern.cpmtelegrambot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "telegram")
public class TelegramEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "telegram_user_gen")
    @SequenceGenerator(name = "telegram_user_gen", sequenceName = "telegram_user_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "is_bot")
    private Boolean isBot;

    private String firstname;
    private String username;
    @Column(name = "telegram_id")
    private Long telegramId;
    @Column(columnDefinition = "boolean default true")
    private Boolean canJoinGroups;
    @Column(name = "language_code")
    private String languageCode;
    @Column(name = "is_active")
    private Boolean isActive;
    private Integer step;
}