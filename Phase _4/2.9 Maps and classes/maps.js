// ----------------------------Example 1 :------------------------------    
    const map = new Map(); // an empty map
        console.log(map); 
	
	map.set('info', {name: 'Vicky', age: 25}); // insert key-value pair
	console.log(map); 
	
	console.log(map.get('info'));   // access the elements of a Map
	
	console.log(map.has('info'));  // check if an element is in Set
	
	map.delete('age'); // removing a particular element
	console.log(map); // 

	map.delete('info'); // true
	console.log(map);
	


//----------------------------Example 2:----------------------------//
	// Using Map.prototype.set(k, v) creating an empty map
	var map1 = new Map();
	
	// adding some elements to the map
	map1.set("first name", "Vishal");
	map1.set("last name", "Padhy");
	map1.set("website", "Airbus")
		.set("friend 1","Vicky")
		.set("friend 2","Bunty");
	
	console.log(map1);
		
	// Using Map.prototype.has(k) retuns true
	console.log("map1 has website ? "+ map1.has("website"));
	
	// return false
	console.log("map1 has firend 3 ? " + map1.has("friend 3"));
		
	// Using Map.prototype.get(k) returns geeksforgeeks
        console.log("--------get----------");
	console.log("get value for key website "+ map1.get("website"));
	
	// returns undefined
	console.log("get value for key friend 3 "+ map1.get("friend 3"));
	
	// Using Map.prototype.delete(k) removes key "website" and its value from the map it prints the value of the key
	console.log("delete element with key website " + map1.delete("website"));
		
	// as the value is deleted from the map hence it returns false
        console.log("--------has----------");
	console.log("map1 has website ? "+ map1.has("website"));
	
	// returns false as this key is not in the list
        console.log("--------delete----------");
	console.log("delete element with key website " + map1.delete("friend 3"));
        
        // getting all the keys of the map 
        var get_keys = map1.keys();
        console.log("--------keys----------");
        for(var ele of get_keys)  // for loop
        console.log(ele);
        
        // getting all the values of the map
	var get_values = map1.values();
	console.log("----------values------------");
	for(var ele of get_values)
	console.log(ele);

        // using the forEach 
        console.log("----------forEach------------");
        function printOne(values)     // for each
	{
  	 console.log(values);
	}  
	// It prints value of all the element of the set
	console.log("-----one parameter-----");
	map1.forEach(printOne);
	
	// Using Map.prototype.clear() removing all values from map1
	map1.clear();
	
	// map1 is empty
	console.log(map1);
