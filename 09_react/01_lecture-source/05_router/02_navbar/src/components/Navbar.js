// import {Link} from 'react-router-dom'

// function Navbar () {

//     return(
//         // <div>
//         //     <ul>
//         //         <li><a href={"/"}>Home</a></li>
//         //         <li><a href={"/mypage"}>Mypage</a></li>
//         //         <li><a href={"/login"}>Login</a></li>
//         //     </ul>
//         // </div>
//         <div>
//             <ul>
//                 <li><Link to={"/"}>Home</Link></li>
//                 <li><Link to={"/mypage"}>Mypage</Link></li>
//                 <li><Link to={"/login"}>Login</Link></li>
//             </ul>
//         </div>
//     );
// }

// export default Navbar;



import {NavLink} from 'react-router-dom'

function Navbar(){

    const activeStyle = {
        backgroundColor : 'blue'
    }

    return(
        <div>
            <ul>
                <li><NavLink to={"/main"} style={({ isActive }) => (isActive ? activeStyle : undefined)}>Home</NavLink></li>
                <li><NavLink to={"/mypage"} style={({ isActive }) => (isActive ? activeStyle : undefined)}>Mypage</NavLink></li>
                <li><NavLink to={"/login"} style={({ isActive }) => (isActive ? activeStyle : undefined)}>Login</NavLink></li>
            </ul>
        </div>
    );
}


export default Navbar;