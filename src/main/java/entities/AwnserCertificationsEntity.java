package entities;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AwnserCertificationsEntity {

	private UUID id;
	private UUID certificationID;
	private UUID studentID;
	private UUID questionID;
	private UUID awnserID;
	private int grade;
	private boolean isCorrect;
}
