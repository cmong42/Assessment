package dao.impl;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dao.PlayerDAO;
import dbutil.MySqlConnection;
import model.Player;

public class PlayerDAOImpl implements PlayerDAO {

	@Override
	public int createPlayer(Player player) {
		int c=0;
		try(Connection connection=MySqlConnection.getConnection()){
			String sql="insert into player(id,name,age,city,gender,teamName) values(?,?,?,?,?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, player.getId());
			preparedStatement.setString(2, player.getName());
			preparedStatement.setInt(3, player.getAge());
			preparedStatement.setString(4, player.getCity());
			preparedStatement.setString(5, player.getGender());
			preparedStatement.setString(6, player.getTeamName());
			
			c=preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return c;
	}

	@Override
	public List<Player> getAllPlayers() {
		List<Player> playersList=new ArrayList<>();
		try(Connection connection=MySqlConnection.getConnection()){
			String sql="select id,name,age,city,gender,teamName from player";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Player player=new Player();
				player.setId(resultSet.getInt("id"));
				player.setAge(resultSet.getInt("age"));
				player.setName(resultSet.getString("name"));
				player.setGender(resultSet.getString("gender"));
				player.setTeamName(resultSet.getString("teamName"));
				player.setCity(resultSet.getString("city"));
				playersList.add(player);
			}
			
		}catch (Exception e) {
			System.out.println(e);
		}
		return playersList;
	}

	@Override
	public int updatePlayer(int id, String city) {
		int result = 0;
		try(Connection connection=MySqlConnection.getConnection()){
		String sql="update player set city=? where id = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(2, id);
		preparedStatement.setString(1, city);
		preparedStatement.executeUpdate();
		preparedStatement.close();
		System.out.println("Success!");
		result = 1;
		}catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}

	@Override
	public void deletePlayer(int id) {
		String sql="delete from player where id=?";
		try(Connection connection=MySqlConnection.getConnection()) {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
			preparedStatement.close();
			System.out.println("Success!");
		}catch(Exception e){
			System.out.println(e);
			
		}
		
	}
}
