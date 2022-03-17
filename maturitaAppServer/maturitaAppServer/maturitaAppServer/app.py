"""
This script runs the application using a development server.
It contains the definition of routes and views for the application.
"""

from flask import Flask, render_template, request, jsonify
import json
app = Flask(__name__)



def servoListener():
    record = json.loads(request.data)
    ser.write(("Servo:"+str(record['servoValue'])).encode())
    return jsonify(record)


@app.route('/authenticate', methods=['POST'])
def authenticate():
    record=json.loads(request.data)
    print(request)
    if record["schoolName"]=="test" and record["classroomLogin"]=="test":
        school={"name":"Gymnázium a SOŠZE Vyškov", "authenticated":True, "logoURL": "null"}
        print("true")
        return jsonify(school)

    else: 
        school={"authenticated":False}
        print("false")
        sleep(2000)
        return jsonify(school)


@app.route('/')
def hello():
    """Renders a sample page."""
    return "Hello World!"

if __name__ == '__main__':
    
    app.run()
