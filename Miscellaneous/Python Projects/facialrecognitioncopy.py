import face_recognition
import cv2
import numpy as np
import time
import subprocess
subprocess.call('ls', shell=True)
time= time.asctime( time.localtime(time.time()) )
file2 = open("/Users/christineong/Documents/timeused\:name.txt","a")#write mode 
facetime = []
# This is a demo of running face recognition on live video from your webcam. It's a little more complicated than the
# other example, but it includes some basic performance tweaks to make things run a lot faster:
#   1. Process each video frame at 1/4 resolution (though still display it at full resolution)
#   2. Only detect faces in every other frame of video.

# PLEASE NOTE: This example requires OpenCV (the `cv2` library) to be installed only to read from your webcam.
# OpenCV is *not* required to use the face_recognition library. It's only required if you want to run this
# specific demo. If you have trouble installing it, try any of the other demos that don't require it instead.

# Get a reference to webcam #0 (the default one)
video_capture = cv2.VideoCapture(0)

# Load a sample picture and learn how to recognize it.

# Load a second sample picture and learn how to recognize it.
caroline_image = face_recognition.load_image_file("/Users/christineong/Desktop/caroline.jpg")
caroline_face_encoding = face_recognition.face_encodings(caroline_image)[0]

nicks_image = face_recognition.load_image_file("/Users/christineong/Desktop/nicks.png")
nicks_face_encoding = face_recognition.face_encodings(nicks_image)[0]


christine_image = face_recognition.load_image_file("/Users/christineong/Documents/christine.png")
christine_face_encoding = face_recognition.face_encodings(christine_image)[0]

emily_image = face_recognition.load_image_file("/Users/christineong/Desktop/emily.png")
emily_face_encoding = face_recognition.face_encodings(emily_image)[0]


sam_image = face_recognition.load_image_file("/Users/christineong/Desktop/sam.png")
sam_face_encoding = face_recognition.face_encodings(sam_image)[0]

# Create arrays of known face encodings and their names
known_face_encodings = [
    caroline_face_encoding, nicks_face_encoding, christine_face_encoding, emily_face_encoding, sam_face_encoding
]
known_face_names = [
    "Caroline Ong",
    "Nicks Hasley",
    "Christine Ong",
    "Emily Ong",
    "Samuel Ong"
]

# Initialize some variables
face_locations = []
face_encodings = []
face_names = []
process_this_frame = True

while True:
    # Grab a single frame of video
    ret, frame = video_capture.read()

    # Resize frame of video to 1/4 size for faster face recognition processing
    small_frame = cv2.resize(frame, (0, 0), fx=0.25, fy=0.25)

    # Convert the image from BGR color (which OpenCV uses) to RGB color (which face_recognition uses)
    rgb_small_frame = small_frame[:, :, ::-1]

    # Only process every other frame of video to save time
    if process_this_frame:
        # Find all the faces and face encodings in the current frame of video
        face_locations = face_recognition.face_locations(rgb_small_frame)
        face_encodings = face_recognition.face_encodings(rgb_small_frame, face_locations)

        face_names = []
        for face_encoding in face_encodings:
            # See if the face is a match for the known face(s)
            matches = face_recognition.compare_faces(known_face_encodings, face_encoding)
            name = "Unknown"
            

            # # If a match was found in known_face_encodings, just use the first one.
            # if True in matches:
            #     first_match_index = matches.index(True)
            #     name = known_face_names[first_match_index]

            # Or instead, use the known face with the smallest distance to the new face
            face_distances = face_recognition.face_distance(known_face_encodings, face_encoding)
            best_match_index = np.argmin(face_distances)
            if matches[best_match_index]:
                name = known_face_names[best_match_index]
                subprocess.call('osascript -e tell application "system events" to keystroke "c"', shell=True)
                subprocess.call('osascript -e tell application "system events" to keystroke "armilla"', shell=True)
                subprocess.call('osascript -e tell application "system events" to keystroke return', shell=True)
            face_names.append(name)


    process_this_frame = not process_this_frame


    # Display the results
    for (top, right, bottom, left), name in zip(face_locations, face_names):
        # Scale back up face locations since the frame we detected in was scaled to 1/4 size
        top *= 4
        right *= 4
        bottom *= 4
        left *= 4

        # Draw a box around the face
        cv2.rectangle(frame, (left, top), (right, bottom), (0, 0, 255), 2)

        # Draw a label with a name below the face
        cv2.rectangle(frame, (left, bottom - 35), (right, bottom), (0, 0, 255), cv2.FILLED)
        font = cv2.FONT_HERSHEY_DUPLEX
        cv2.putText(frame, name, (left + 6, bottom - 6), font, 1.0, (255, 255, 255), 1)

    # Display the resulting image
    cv2.imshow('Video', frame)

    # Hit 'q' on the keyboard to quit!
    if cv2.waitKey(1) & 0xFF == ord('q'):
        break

# Release handle to the webcam
face_names.append(name)
file2.write((str(name)+" used this laptop at " + str(time)))
file2.close()
print(str(name)+" used this laptop at " + str(time))
video_capture.release()
cv2.destroyAllWindows()
