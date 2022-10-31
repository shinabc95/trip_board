  var oEditors = []

      nhn.husky.EZCreator.createInIFrame({
        oAppRef: oEditors,
        elPlaceHolder: "editorTxt",
        sSkinURI: "/smarteditor/SmartEditor2Skin.html",
        fCreator: "createSEditor2"
      })

    savePost = function() {
      oEditors.getById["editorTxt"].exec("UPDATE_CONTENTS_FIELD", [])
      let content = document.getElementById("editorTxt").value

      if(content == "") {
        alert("내용을 입력해주세요.")
        oEditors.getById["editorTxt"].exec("FOCUS")
        return
      } else {
        console.log(content)
      }
    }

    savePost = function(){
    oEditors.getById["editorTxt"].exec("UPDATE_CONTENTS_FIELD", [])
    let content = document.getElementById("editorTxt").value

    if(content == ""){
    alert("내용을 입력해주세요.")
    oEditors.getById["editorTxt"].exec("FOCUS")
    return
    }else{
    let post = {
    title: $("#title")[0].value, content: content
    }

    $.ajax({
    url: "/smarteditor/savePost",
    data: post,
    success: function(data){
    console.log("success")
    alert("저장하였습니다.")
    }
    , error: function(jqXHR, textStatus, errorThrown){
    console.log(jqXHR)
    alert("오류 발생했습니다.")
    }
    })
    }
    }