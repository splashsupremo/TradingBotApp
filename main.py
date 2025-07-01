
import websocket, json, time, requests
from collections import deque, defaultdict
from datetime import datetime
import numpy as np

TELEGRAM_API_URL = "https://api.telegram.org/bot7972940282:AAFQy86o6lzC8mPKUMy9SkskJGoqSPaM-4U/sendMessage"
CHAT_ID = "-1001437396520"

def send_telegram(msg):
    requests.post(TELEGRAM_API_URL, data={'chat_id': CHAT_ID, 'text': msg})

def start_bot():
    # Minimal function to simulate WebSocket
    send_telegram("Bot started successfully.")
