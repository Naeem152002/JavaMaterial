package dao;

import bean.UserBean;

public interface UserDao
{
	public String registerUser(UserBean model);
	public String loginUser(UserBean model);
}
