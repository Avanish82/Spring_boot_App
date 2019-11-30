<html> 

<head> 
     
    
    <style>
        body {
            font-family: 'Roboto', sans-serif;
        }
    </style>
    

       <script src="js/shaka-player.compiled.js"></script>
    <script src="js/shakaplayer-dna-wrapper.js"></script>

    <!-- Graphs -->
    <script src="js/graphs.js"></script>    
    <script src="js/header.js"></script>
    

    <body>
        <header></header>
        <center>
            <video controls autoplay muted id="video/avc1/1" width="640" height="360" controls>
        </center>
        <script> 
          
           var videoElement = document.getElementById('video/avc1/1');
            var shakaplayer = new shaka.Player(videoElement);
            var playerConfig = {
                    streaming: {
                        bufferingGoal: 30,
                    },
            };
                var dnaConfig = { 
                    "property": "shakaplayer",
                    "fragmentsFetchedBeforeLoad": 30,
                }
         
            var wrapper = new ShakaPlayerDnaWrapper(shakaplayer, 'property', dnaConfig);
            shakaplayer.configure(playerConfig);
          // shakaplayer.load('E:/Avanish/Video/output/stream.mpd');
            shakaplayer.load('../output/stream.mpd');  
            
            var h= null;
        </script>
         
    </body>

</html>