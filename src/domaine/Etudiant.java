package domaine;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Etudiant {

	@Id
	@Column(name="idS")
	private int id;

	@Column(name="nameS")
	private String name;

	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Etudiant(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
