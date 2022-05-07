package workflow.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * @author Jin Zheng
 * @since 2022-05-07
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "t_user")
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String username;
	private String password;

	@Enumerated(EnumType.STRING)
	private UserStatus status;

	private LocalDateTime registerTime;
	private LocalDateTime loginTime;

	public UserEntity(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@PrePersist
	public void onPrePersist() {
		this.status = UserStatus.ACTIVE;
		this.registerTime = LocalDateTime.now();
		this.loginTime = this.registerTime;
	}
}
