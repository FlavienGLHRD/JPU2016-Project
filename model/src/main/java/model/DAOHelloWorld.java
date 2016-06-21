package model;

import java.beans.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Elements.Elements;
import MotionlessElements.MotionlessElements;
import World.World;
import contract.IMotionless;

/**
 * The Class DAOHelloWorld.
 *
 * @author Jean-Aymeric Diet
 */
 class DAOHelloWorld extends DAOEntity<WorldEntity> {

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
	public boolean create(final WorldEntity entity) {
		// Not implemented
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#delete(model.Entity)
	 */
	@Override
	public boolean delete(final WorldEntity entity) {
		// Not implemented
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#update(model.Entity)
	 */
	@Override
	public boolean update(final WorldEntity entity) {
		// Not implemented
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#find(int)
	 */
	public WorldEntity find(final int id) {
		
		WorldEntity worldEntity = new WorldEntity();
		try {
			final String sql = "{call searchOnlyElements(?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setInt(1,id);
			call.execute();
			final ResultSet resultSet = call.getResultSet();
			while (resultSet.next()) {
				worldEntity.addElement((IMotionless) MotionlessElements.getFromDbId(resultSet.getInt("ID_MotionlessElements")), resultSet.getInt("X"), resultSet.getInt("Y"));
			}
			return worldEntity;
			//System.out.println(worldEntity);
		} 
		catch (final SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	
}
