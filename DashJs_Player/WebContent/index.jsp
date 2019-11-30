<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script src="../../contrib/akamai/controlbar/ControlBar.js"></script>
<script src="../../dist/dash.all.debug.js"></script>
<script>
    function startVideo() {
        const url = 'https://dash.akamaized.net/akamai/bbb_30fps/bbb_30fps.mpd';
        var videoElement = document.querySelector(".videoContainer video");

        var player = dashjs.MediaPlayer().create();
        player.initialize(videoElement, url, true);
        var controlbar = new ControlBar(player);
        controlbar.initialize();
    }

</script>
<div class="dash-video-player ">
    <!-- HTML structure needed for the ControlBar -->
    <div class="videoContainer" id="videoContainer">
        <video preload="auto" autoplay="true"> </video>
        <div id="videoController" class="video-controller unselectable">
            <div id="playPauseBtn" class="btn-play-pause" title="Play/Pause">
                <span id="iconPlayPause" class="icon-play"></span>
            </div>
            <span id="videoTime" class="time-display">00:00:00</span>
            <div id="fullscreenBtn" class="btn-fullscreen control-icon-layout" title="Fullscreen">
                <span class="icon-fullscreen-enter"></span>
            </div>
            <div id="bitrateListBtn" class="control-icon-layout" title="Bitrate List">
                <span class="icon-bitrate"></span>
            </div>
            <input type="range" id="volumebar" class="volumebar" value="1" min="0" max="1" step=".01">
            <div id="muteBtn" class="btn-mute control-icon-layout" title="Mute">
                <span id="iconMute" class="icon-mute-off"></span>
            </div>
            <div id="trackSwitchBtn" class="control-icon-layout" title="A/V Tracks">
                <span class="icon-tracks"></span>
            </div>
            <div id="captionBtn" class="btn-caption control-icon-layout" title="Closed Caption">
                <span class="icon-caption"></span>
            </div>
            <span id="videoDuration" class="duration-display">00:00:00</span>
            <div class="seekContainer">
                <div id="seekbar" class="seekbar seekbar-complete">
                    <div id="seekbar-buffer" class="seekbar seekbar-buffer"></div>
                    <div id="seekbar-play" class="seekbar seekbar-play"></div>
                </div>
            </div>
        </div>
    </div>
</div>


</head>
<body>

</body>
</html>