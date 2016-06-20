package model;

import java.beans.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.text.html.parser.Element;

import Elements.Elements;
import World.World;

/**
 * The Class DAOHelloWorld.
 *
 * @author Jean-Aymeric Diet
 */
 class DAOHelloWorld extends DAOEntity<World> {

	public DAOHelloWorld(Connection connection) throws SQLException {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new DAO hello world.
	 *
	 * @param connection
	 *          the connection
	 * @throws SQLException
	 *           the SQL exception
	 */

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#create(model.Entity)
	 */
	@Override
	public boolean create(final World entity) {
		// Not implemented
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#delete(model.Entity)
	 */
	@Override
	public boolean delete(final World entity) {
		// Not implemented
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#update(model.Entity)
	 */
	@Override
	public boolean update(final World entity) {
		// Not implemented
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#find(int)
	 */
	public ArrayList<Elements> find(final int id) {
		
		ArrayList<Elements> addElements = new ArrayList<Elements>();

		try {
			final String sql = "{call searchonlyelements(?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setInt(1,id);
			call.executeQuery();
			final ResultSet resultSet = call.getResultSet();
			while (resultSet.next()) {
				addElements.add(new Elements(resultSet.getInt("X"),resultSet.getInt("Y"),resultSet.getString("Description")));
			}
			return addElements;
		} 
		catch (final SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public World find(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#find(java.lang.String)
	 */
	/*	@Override
	public HelloWorld find(final String key) {
		HelloWorld helloWorld = new HelloWorld();

		try {
			final String sql = "{call helloworldByKey(?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setString(1, key);
			call.execute();
			final ResultSet resultSet = call.getResultSet();
			if (resultSet.first()) {
				helloWorld = new HelloWorld(resultSet.getInt("id"), key, resultSet.getString("message"));
			}
			return helloWorld;
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return null;
	}*/
}
