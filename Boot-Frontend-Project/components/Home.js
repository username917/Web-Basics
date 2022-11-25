import React from 'react';
import {useEffect, useState} from 'react';
import  Banana from './Banana';
 
const Home = () => {

    const [selected, setSelected] = useState('');

    const [bananaVisible, setBananaVisible] = useState(false);

    useEffect(() => {
        selected === "apple"
        ? setBananaVisible(true)
        : setBananaVisible(false)
    }, [selected]);

    const handleChange = event => {
        console.log('Label 👉️', event.target.selectedOptions[0].label);
        console.log(event.target.value);
        setSelected(event.target.value);
      };
            
    return (
       <div>
          <h1>Home</h1>
           <p>Home page body content</p>

        <select value={selected} onChange={handleChange}>
            <option value="">--Choose and option--</option>
            <option value="apple">Apple 🍏</option>
            <option value="banana">Banana 🍌</option>
            <option value="kiwi">Kiwi 🥝</option>
            
        </select>
        <h1>{selected}</h1>

        {bananaVisible && <Banana />}

       </div>
       
    );
}

 
export default Home;

