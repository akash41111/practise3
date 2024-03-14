// import logo from './logo.svg';
import './App.css';
import React , {useState} from 'react';

function App() {
  const [weight,setWeight] = useState(0);
  const [height,setHeight] = useState(0);
  const [bmi , setBmi] = useState(0);
  const [message,setMessage] = useState('');


  let calcBmi = (e) =>{
    //prevent submitting to the server
    e.preventDefault()
 
    if (weight === 0 || height === 0) {
      alert('Please enter a valid weight and height')
    } else {
      let bmi = (weight / (height * height) * 703)
      setBmi(bmi.toFixed(1))
 
      // Logic for message
 
      if (bmi < 25) {
        setMessage('You are underweight')
      } else if (bmi >= 25 && bmi < 30) {
        setMessage('You are a healthy weight')
      } else {
        setMessage('You are overweight')
      }
    }
  }
 let reload = (e) =>{
    window.location.reload()
  }

  return (
    <div className="App">
      <div className='container'>
        <h2 className='center'>BMI Calculator</h2>
        <form onSubmit={calcBmi}>
          <div>
            <label>Weight (lbs)</label>
            <input value={weight} 
            onChange ={ (event) => setWeight(event.target.value) }/>
          </div>
          <div>
            <label>Height (inch)</label>
            <input value={height} 
            onChange ={ (event) => setHeight(event.target.value) }/>
            
          </div>

          <div>
            <button className='btn' type='submit'>Submit</button>
            <button className='btn btn-outline' onClick={reload} type='submit'>Reload</button>
          </div>

        </form>
         <div>
            <p>your bmi is: {bmi}</p>
            <p> {message}</p>
         </div>

      </div>
    </div>
  );
}

export default App;
