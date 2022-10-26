<script>
    var oEditors = [];
	nhn.husky.EZCreator.createInIFrame({
		oAppRef: oEditors,
		elPlaceHolder: "ir1",
		sSkinURI: $('#contextPath').data('path') + "libs/smarteditor/SmartEditor2Skin.html",
		fCreator: "createSEditor2"
	});
</script>