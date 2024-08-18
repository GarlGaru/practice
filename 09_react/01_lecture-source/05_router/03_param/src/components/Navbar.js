import {NavLink} from 'react-router-dom'

function Navbar(){

    const activeStyle = {
        backgroundColor : 'purple',
        color: 'white'
    }

    return(
        <div>
            <ul>
                <li><NavLink to="/main" style={({ isActive }) => (isActive ? activeStyle : undefined)}>Home</NavLink></li>
                <li><NavLink to="/about" style={({ isActive }) => (isActive ? activeStyle : undefined)}>about</NavLink></li>
                <li><NavLink to="/menu" style={({ isActive }) => (isActive ? activeStyle : undefined)}>menu</NavLink></li>
            </ul>
        </div>
    );
}


export default Navbar;