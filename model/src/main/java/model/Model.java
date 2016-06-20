package model;

import java.sql.SQLException;
import java.util.Observable;

import contract.IModel;
import contract.IWorldEntity;

/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public class Model extends Observable implements IModel {

	final DAOHelloWorld daoHelloWorld;
	private final IWorldEntity worldEntity;
	
	public Model() throws Exception{
		this.daoHelloWorld = new DAOHelloWorld(DBConnection.getInstance().getConnection());
		this.worldEntity = this.daoHelloWorld.find(3);
		


	}

	public IWorldEntity getWorldEntity() {
		return worldEntity;
	}
	
	public Observable getObservable() {
		// TODO Auto-generated method stub
		return this.worldEntity.getObservable();
	}
}