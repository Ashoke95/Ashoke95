package com.Ashoke1.OneToManyRelation;

import java.util.List;

import javax.persistence.*;

@Table(name="question")
@Entity
public class Question {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	     private int id;
	      private String qname;
	      @OneToMany(cascade=CascadeType.ALL)
	      @JoinColumn(name="qid")
	      private List<Answer> answers;
		int getId() {
			return id;
		}
		void setId(int id) {
			this.id = id;
		}
		String getQname() {
			return qname;
		}
		void setQname(String qname) {
			this.qname = qname;
		}
		List<Answer> getAnswers() {
			return answers;
		}
		void setAnswers(List<Answer> answers) {
			this.answers = answers;
		}
	      
	      
	      
	      
}
