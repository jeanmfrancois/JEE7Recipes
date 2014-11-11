/**
 * File Name: BasicView.java<br>
 * jean<br>
 * JMX 2014<br>
 * Programmer: Jean-francois Nepton<br>
 * E-mail: jeanmfrancois@hotmail.com<br>
 * Created: Nov 11, 2014
 */
package com.jfbuilds.jee7.recipes.primefaces;

/**
 * BasicView (description of class)
 * <p>
 * (description of core fields)
 * <p>
 * (description of core methods)
 * 
 * @author jean
 * @version %I%, %G%
 * @since 1.0
 */
import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "dtBasicView")
@ViewScoped
public class BasicView implements Serializable {

	private List<Car> cars;

	@ManagedProperty("#{carService}")
	private CarService service;

	@PostConstruct
	public void init() {
		cars = service.createCars(10);
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setService(CarService service) {
		this.service = service;
	}
}
