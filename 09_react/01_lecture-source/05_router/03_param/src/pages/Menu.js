import { useEffect, useState } from "react";
import { getMenuList } from "../apis/MenuAPI";
import MenuItem from "../components/MenuItem";

function Menu() {

    const [menuList, setMenuList] = useState([]);

    useEffect(()=>{
        setMenuList(getMenuList());
    },[])

    return (
        <>
            <h1>판매 메뉴 목록</h1>
            <div>
                {menuList.map(menu=> {
                    // console.log(menu);
                <MenuItem key={menu.menuCode} menu={menu}/> 
                }
                )}
            </div>
            
        </>
    );
}

export default Menu;