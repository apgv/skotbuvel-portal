import React from 'react';
import {Route, BrowserRouter} from 'react-router-dom';
import App from './App';
import Home from './home/Home';
import Callback from './callback/Callback';
import Auth from './auth/Auth';
import history from './history';

const auth = new Auth();

const handleAuthentication = (nextState, replace) => {
    console.log('nextState=' + nextState);
    if (/access_token|id_token|error/.test(nextState.location.hash)) {
        auth.handleAuthentication(nextState.location.hash);
    }
};

export const makeMainRoutes = () => {
    return (
        <BrowserRouter history={history} component={App}>
            <div>
                <Route path="/" render={(props) => <App auth={auth} {...props} />}/>
                <Route path="/home" render={(props) => <Home auth={auth} {...props} />}/>
                <Route path="/callback" render={(props) => {
                    handleAuthentication(props);
                    return <Callback {...props} />
                }}/>
            </div>
        </BrowserRouter>
    );
};
