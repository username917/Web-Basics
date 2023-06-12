import logo from './logo.svg';
import base64 from "base-64";
import './App.css';
import React, { useEffect, useState } from 'react';

const App = () => {
	
	const [coffees, setCoffees] = useState([]);
	
	const fetchCoffeeData = () => {
		
		fetch("http://127.0.0.1:8080/api/coffee"
		
		, {
			headers: {
				
				
				'Authorization': 'Basic' + btoa("user:password"),
				'Content-Type': 'application/json',
     			//"Access-Control-Allow-Origin": "*",
				
				//'Authorization': 'Basic ZHZlZ2E6cGFzc3dvcmQ='
			}
		}
		
		)
		.then(res => {
			return res.json()
		})
		.then(data => {
			setCoffees(data)
		})
		
		
	}
	
	useEffect(() => {
    	fetchCoffeeData()
  	}, [])
	
	
	return (
		
		<div>
		
			{coffees.length > 0 && (
				<ul>
					{coffees.map(coffee => (
						<li key={coffee.id}>{coffee.name}</li>
					))}
				</ul>
			)}
		</div>
	)
	
}

export default App;
