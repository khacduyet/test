package dao;

import java.util.List;

import entity.Computer;

public interface ComputerDAO {
	public List<Computer> getComputers();
	
	public boolean insertComputer(Computer com);
}
