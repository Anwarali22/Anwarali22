package com;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public abstract class Action {
	public abstract String execute(HttpServletRequest request,HttpServletResponse response);
}
