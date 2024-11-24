package entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "messages")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    @JoinColumn(name = "sender_id", nullable = false)
    private User userSend;

    @OneToMany
    @JoinColumn(name = "receiver_id", nullable = false)
    private User userReceive;

    @Column(name = " message_content")
    private String messageContent;

    @Column(name = "sent_at")
    @CreationTimestamp
    private LocalDateTime sentAt;

    @Column(name = "is_read")
    private Boolean isRead;
}
