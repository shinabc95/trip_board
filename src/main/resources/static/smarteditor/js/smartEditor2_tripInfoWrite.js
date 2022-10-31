// 네이버 스마트 에디터 적용 구간
var oEditors = []

      nhn.husky.EZCreator.createInIFrame({
        oAppRef: oEditors,
        elPlaceHolder: "tripInfoBoard_EditorTxt",
        sSkinURI: "/smarteditor/SmartEditor2Skin.html",
        fCreator: "createSEditor2"
      })

    savePost = function() {
      oEditors.getById["tripInfoBoard_EditorTxt"].exec("UPDATE_CONTENTS_FIELD", [])
      let content = document.getElementById("tripInfoBoard_EditorTxt").value

      if(content == "") {
        alert("내용을 입력해주세요.")
        oEditors.getById["tripInfoBoard_EditorTxt"].exec("FOCUS")
        return
      } else {
        console.log(content)
      }
    }
// 네이버 스마트 에디터 적용 구간

 $("#savePost").click(function() {
      oEditors.getById["tripInfoBoard_EditorTxt"].exec("UPDATE_CONTENTS_FIELD", [])
      let title = document.getElementById("tripInfoBoard_Title").value
      let content = document.getElementById("tripInfoBoard_EditorTxt").value
      let city = document.getElementById("city").value
      let district = document.getElementById("district").value
      let detailedAddress = document.getElementById("detailedAddress").value

      if(content == '') {
        alert("내용을 입력해주세요.")
        oEditors.getById["tripInfoBoard_EditorTxt"].exec("FOCUS")
        return
      } else {

        let post = {
          title: title
          , content: content
          , city: city
          , district: district
          , detailedAddress: detailedAddress
        }

        $.ajax({
          type : "POST",            // HTTP method type(GET, POST) 형식이다.
          url: "/smarteditor/savePost"
          , data: post
          , success: function(data) {
            console.log('<success>')
            console.log('post:' + post.title)
            console.log('post:' + post.content)
            console.log('post:' + post.city)
            console.log('post:' + post.district)
            console.log('post:' + post.detailedAddress)
            alert('저장하였습니다.')
          }
          , error: function(jqXHR, textStatus, errorThrown) {
            console.log('<error>')
            console.log('post:' + post.title)
            console.log('post:' + post.content)
            console.log('post:' + post.city)
            console.log('post:' + post.district)
            console.log('post:' + post.detailedAddress)
            console.log(jqXHR)
            alert('오류가 발생하였습니다.')
          }
        })
      }
    });