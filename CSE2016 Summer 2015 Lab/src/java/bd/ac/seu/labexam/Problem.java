/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.labexam;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author kmhasan
 */
@Entity
public class Problem {
    @Id
    private int problemId;
    private String problemName;
    @Embedded
    private ProblemType problemType;

    public Problem() {
    }

    public Problem(int problemId, String problemName, ProblemType problemType) {
        this.problemId = problemId;
        this.problemName = problemName;
        this.problemType = problemType;
    }

    public ProblemType getProblemType() {
        return problemType;
    }

    public void setProblemType(ProblemType problemType) {
        this.problemType = problemType;
    }

    public int getProblemId() {
        return problemId;
    }

    public void setProblemId(int problemId) {
        this.problemId = problemId;
    }

    public String getProblemName() {
        return problemName;
    }

    public void setProblemName(String problemName) {
        this.problemName = problemName;
    }
}
