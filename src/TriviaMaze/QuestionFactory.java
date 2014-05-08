package TriviaMaze;

import java.sql.ResultSet;
import java.sql.SQLException;


public abstract class QuestionFactory {
	protected abstract Question generateQuestion() throws SQLException;
	protected abstract Question generateQuestion(String category) throws SQLException;
	protected SQLProxy dbProxy;
	protected ResultSet randomQuestion;
	public Question getQuestion() throws SQLException
	{
		return generateQuestion();
	}
	public Question getQuestion(String category) throws SQLException
	{
		return generateQuestion(category);
	}

}
