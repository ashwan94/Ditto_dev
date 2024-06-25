import ReactQuill from "../../../js/ReactQuill";
import React, {useState} from "react";
import {useLocation} from "react-router-dom";

export default function Update() {
    const freeBoardNo = useLocation().state.freeBoardNo; // 상세 페이지(view.js) 에서 전달받은 게시글 번호
    const [updateBtn, setUpdateBtn] = useState(false); // Editor 컴포넌트 마운트 상태값

    return (
        <article className="mt-32 ml-32 mr-32">
            <ReactQuill boardNo={freeBoardNo} updateBtn={updateBtn}/>
        </article>
    )
}